package cj.netos.rc.wybank.cmd;

import cj.netos.rabbitmq.CjConsumer;
import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rabbitmq.RetryCommandException;
import cj.netos.rabbitmq.consumer.IConsumerCommand;
import cj.netos.rc.wybank.IExchangeService;
import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.model.ExchangeRecord;
import cj.netos.rc.wybank.model.PurchaseRecord;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

@CjConsumer(name = "report")
@CjService(name = "/report.ports#exchange")
public class ExchangeCommand implements IConsumerCommand {

    @CjServiceRef
    IExchangeService exchangeService;

    @Override
    public void command(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws RabbitMQException, RetryCommandException {
        ExchangeRecord record = new Gson().fromJson(new String(body), ExchangeRecord.class);
        exchangeService.doReport(record);
    }
}
