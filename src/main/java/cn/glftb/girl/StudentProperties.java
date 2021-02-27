package cn.glftb.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    private String grade;
    private Integer age;
    private String telephone;

    public String getGrade() {
        return grade;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
