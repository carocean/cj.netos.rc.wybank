package cj.netos.rc.wybank.cmd;

import cj.netos.rabbitmq.CjConsumer;
import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rabbitmq.RetryCommandException;
import cj.netos.rabbitmq.consumer.IConsumerCommand;
import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.bo.model.PurchaseRecord;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

@CjConsumer(name = "report")
@CjService(name = "/report.ports#purchase")
public class PurchaseCommand implements IConsumerCommand {

    @CjServiceRef
    IPurchaseService purchaseService;

    @Override
    public void command(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws RabbitMQException, RetryCommandException {
        PurchaseRecord record = new Gson().fromJson(new String(body), PurchaseRecord.class);
        purchaseService.doReport(record);
    }
}
