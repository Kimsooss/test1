package soo.soos.kafka;
import java.util.Properties;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
public class ProducerExam {
//	private kafka.javaapi.producer.Producer<Integer, String> producer;
	public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        ProducerConfig producerConfig = new ProducerConfig(props);
        Producer<String, String> producer = new Producer<String, String>(producerConfig);
       
		KeyedMessage<String, String> message = new KeyedMessage<String, String>("test", "1818181818ss");  
        
       for (int i = 0; i < 99; i++) {
		i++;
        try {
       	 producer.send(new KeyedMessage<String, String>("testa", "1818181818ss"+i));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

       
       }
        
        
//        producer.send(message);
        producer.close();
	}
}
