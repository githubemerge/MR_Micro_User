package emerge.project.mrsolution_micro.utils.entittes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Error implements Serializable {


    @SerializedName("code")
    String code;

    @SerializedName("type")
    String type;

    @SerializedName("description")
    String description;


    public Error(String code,String type,String des){
        this.code = code;
        this.type = type;
        this.description = des;

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
