package kodlamaio.hrms.core.adapters.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;

public class CloudinaryUserConfig {
    @Bean(name = {"getCloudinaryUser", "Cloudinary"})
    public Cloudinary getCloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "hrmsjava",
                "api_key", "334785192546272",
                "api_secret", "K6b6XkNhBT9H-Y0jnDw6YPm3aPs"));
    }
}
