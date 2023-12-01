DataAggregationService.java
public class 
InsrancePolicyAggregation {
    privte DataNormalizationService
    normalizationService,
    DataAggregationService
    aggregationService;

    public InsrancePolicyAggregator(
        DataNormalizationService
        normalizationService,
        DataAggregationService
        aggregationService;)
        this.normalizationService =
        normalizationService;
        this.aggregationService =
        aggregationService
}

public void
processPolies(List<Policy> policies)
{
    List<Policy>NormalizedPolicy =
    new Arraylist<>();

    for(Policy policy : policies){
        Policy normalizaPolicy = normalizationService.NormalizaPolicyData(policy);
        normalizedPolicies.add(normalizedPolicies);
    }
    aggregationService.aggregatePolicies(normalizedPolicies);
    
}
