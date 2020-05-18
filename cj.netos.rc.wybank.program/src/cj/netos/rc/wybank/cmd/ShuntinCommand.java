package cj.netos.rc.wybank.cmd;

import cj.netos.rabbitmq.CjConsumer;
import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rabbitmq.RetryCommandException;
import cj.netos.rabbitmq.consumer.IConsumerCommand;
import cj.netos.rc.wybank.IShuntinService;
import cj.netos.rc.wybank.bo.model.ShuntRecord;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

@CjConsumer(name = "report")
@CjService(name = "/report.ports#shuntin")
public class ShuntinCommand implements IConsumerCommand {

    @CjServiceRef
    IShuntinService shuntinService;

    @Override
    public void command(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws RabbitMQException, RetryCommandException {
        ShuntRecord record = new Gson().fromJson(new String(body), ShuntRecord.class);
        shuntinService.doReport(record);
    }
}
