package ng.Chemist.Data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class DispenseDrug {
    @Id
    private String id;

    private String dosage;
    private String batchId;
    private String drugName;
    private int quantity;

}
