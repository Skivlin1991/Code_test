import org.junit.jupiter.api.assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

importjava.util.Arraylist;
importjava.util.List;

public class InsrancePolicyAggregatorTest
{
    privte InsranceAggregator aggregator;

    @BeforeEach
    public void setUp(){
        aggregator = new InsranceAggregator();
    }
    @Test public void
    testAggregateDataFromBrokers(){
        List<String>brokersFiles = new Arraylist<>();
            brokersFiles.add("testBroker1.txt");
            brokersFiles.add("testBroker2.csv");
        aggregator.testAggregateDataFromBrokers(brokersFiles);
        List<InsrancePolicy>policies = aggregator.getPolices();
        Assertions.assertEquals(4,policies.size)
        }
    @Test
    public voidtestGenerateInsights();
    aggregator.generateinsights();
}