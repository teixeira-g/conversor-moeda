package models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ConversionResponse {

    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates){
        this.conversionRates = conversionRates;
    }
}
