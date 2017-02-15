package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import java.util.List;

/**
 * Created by sanera on 15/02/2017.
 */
public class FACatchSummaryDTO {
    List<FACatchSummaryRecordDTO> recordDTOs;
    SummaryTableDTO total;

    public List<FACatchSummaryRecordDTO> getRecordDTOs() {
        return recordDTOs;
    }

    public void setRecordDTOs(List<FACatchSummaryRecordDTO> recordDTOs) {
        this.recordDTOs = recordDTOs;
    }

    public SummaryTableDTO getTotal() {
        return total;
    }

    public void setTotal(SummaryTableDTO total) {
        this.total = total;
    }
}
