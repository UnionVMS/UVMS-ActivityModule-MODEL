package eu.europa.ec.fisheries.uvms.activity.model.mapper;

import eu.europa.ec.fisheries.uvms.activity.model.dto.facatch.FACatchSummaryDTO;
import eu.europa.ec.fisheries.uvms.activity.model.dto.facatch.FACatchSummaryRecordDTO;
import eu.europa.ec.fisheries.uvms.activity.model.dto.facatch.SummaryTableDTO;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.*;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sanera on 17/02/2017.
 */
public class FACatchMapper {

    public static FACatchSummaryDTO mapToFACatchSummaryDTO(FACatchSummaryReportResponse faCatchSummaryReportResponse){
        FACatchSummaryDTO faCatchSummaryDTO = new FACatchSummaryDTO();
        List<FACatchSummaryRecordDTO> faCatchSummaryRecordDTOs = new ArrayList<>();
        List<FACatchSummaryRecord> faCatchSummaryRecords= faCatchSummaryReportResponse.getSummaryRecords();
        for(FACatchSummaryRecord faCatchSummaryRecord : faCatchSummaryRecords){
            faCatchSummaryRecordDTOs.add(mapToFACatchSummaryRecordDTO(faCatchSummaryRecord));
        }
        faCatchSummaryDTO.setRecordDTOs(faCatchSummaryRecordDTOs);
        faCatchSummaryDTO.setTotal(mapToSummaryTableDTO(faCatchSummaryReportResponse.getTotal()));

        return  faCatchSummaryDTO;
    }

    public static FACatchSummaryRecordDTO mapToFACatchSummaryRecordDTO(FACatchSummaryRecord faCatchSummaryRecord){
        FACatchSummaryRecordDTO faCatchSummaryRecordDTO = new FACatchSummaryRecordDTO();
        faCatchSummaryRecordDTO.setGroups(faCatchSummaryRecord.getGroups());
        faCatchSummaryRecordDTO.setSummaryTable(mapToSummaryTableDTO(faCatchSummaryRecord.getSummary()));

        return faCatchSummaryRecordDTO;

    }

    public static SummaryTableDTO mapToSummaryTableDTO(SummaryTable summaryTable){
        SummaryTableDTO summaryTableDTO = new SummaryTableDTO();

        Map<FishSizeClassEnum,Object> summaryFishSizeMap = new HashMap();
        List<SummaryFishSize> fishSizeSummaries = summaryTable.getFishSizeSummaries();
        for(SummaryFishSize summaryFishSize:fishSizeSummaries){
            FishSizeClassEnum fishSizeClassEnum=  summaryFishSize.getFishSize();
            if(CollectionUtils.isNotEmpty(summaryFishSize.getSpecies())){
                summaryFishSizeMap.put(fishSizeClassEnum,summaryFishSize.getSpecies());
            }else if(summaryFishSize.getFishSizeCount() !=null){
                summaryFishSizeMap.put(fishSizeClassEnum,summaryFishSize.getFishSizeCount());
            }

        }
        summaryTableDTO.setSummaryFishSize(summaryFishSizeMap);


        Map<FaCatchTypeEnum,Object> faCatchTypeEnumObjectMap = new HashMap();
        List<SummaryFACatchtype> faCatchTypeSummaries = summaryTable.getFaCatchTypeSummaries();
        for(SummaryFACatchtype summaryFACatchtype:faCatchTypeSummaries){
            FaCatchTypeEnum faCatchTypeEnum =  summaryFACatchtype.getCatchType();
            if(CollectionUtils.isNotEmpty(summaryFACatchtype.getSpecies())){
                faCatchTypeEnumObjectMap.put(faCatchTypeEnum,summaryFACatchtype.getSpecies());
            }else if(summaryFACatchtype.getCatchTypeCount() !=null){
                faCatchTypeEnumObjectMap.put(faCatchTypeEnum,summaryFACatchtype.getCatchTypeCount());
            }

        }
        summaryTableDTO.setSummaryFaCatchType(faCatchTypeEnumObjectMap);


        return  summaryTableDTO;
    }
}
