package ch.vsnd.vsndbackend.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class AppConfig extends WebMvcConfigurationSupport  {
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssX")
                .create();
        gsonHttpMessageConverter.setGson(gson);
        converters.add(gsonHttpMessageConverter);

        super.configureMessageConverters(converters);
    }
}