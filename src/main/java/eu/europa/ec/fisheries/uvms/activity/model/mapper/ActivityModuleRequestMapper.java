/*
Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it 
and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of 
the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more 
details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.

 */

package eu.europa.ec.fisheries.uvms.activity.model.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import eu.europa.ec.fisheries.uvms.activity.model.exception.ActivityModelMarshallException;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityIDType;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityModuleMethod;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityTableType;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityUniquinessList;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FACatchSummaryReportRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FishingActivityForTripIds;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FishingTripRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.GetFishingActivitiesForTripRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.GetNonUniqueIdsRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.GroupCriteria;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ListValueTypeFilter;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.MapToSubscriptionRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.MessageType;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.PluginType;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.SetFLUXFAReportOrQueryMessageRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.SingleValueTypeFilter;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.SyncAsyncRequestType;
import un.unece.uncefact.data.standard.unqualifieddatatype._20.IDType;

/**
 * Created by sanera on 06/06/2016.
 */
public final class ActivityModuleRequestMapper {

    private ActivityModuleRequestMapper(){

    }

    public static String mapToGetNonUniqueIdRequest(Map<ActivityTableType, List<IDType>> requestList) throws ActivityModelMarshallException {
        if(requestList == null || requestList.isEmpty()){
            return null;
        }
        GetNonUniqueIdsRequest request = new GetNonUniqueIdsRequest();
        request.setMethod(ActivityModuleMethod.GET_NON_UNIQUE_IDS);
        List<ActivityUniquinessList> uniqList = new ArrayList<>();
        request.setActivityUniquinessLists(uniqList);
        for(Map.Entry<ActivityTableType, List<IDType>> mapEntry : requestList.entrySet()){
            ActivityUniquinessList uniquinessListElement = new ActivityUniquinessList();
            uniquinessListElement.setActivityTableType(mapEntry.getKey());
            List<ActivityIDType> idTypes = new ArrayList<>();
            for(IDType idType : mapEntry.getValue()){
                ActivityIDType actIdType = new ActivityIDType();
                actIdType.setIdentifierSchemeId(idType.getSchemeID());
                actIdType.setValue(idType.getValue());
                idTypes.add(actIdType);
            }
            uniquinessListElement.setIds(idTypes);
            uniqList.add(uniquinessListElement);
        }
        if(isEmptyGetNonUniqueIdsRequest(request)){
            return null;
        }
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static GetNonUniqueIdsRequest mapToGetNonUniqueIdRequestObject(Map<ActivityTableType, List<IDType>> requestList) throws ActivityModelMarshallException {
        if(requestList == null || requestList.isEmpty()){
            return null;
        }
        GetNonUniqueIdsRequest request = new GetNonUniqueIdsRequest();
        request.setMethod(ActivityModuleMethod.GET_NON_UNIQUE_IDS);
        List<ActivityUniquinessList> uniqList = new ArrayList<>();
        request.setActivityUniquinessLists(uniqList);
        for(Map.Entry<ActivityTableType, List<IDType>> mapEntry : requestList.entrySet()){
            ActivityUniquinessList uniquinessListElement = new ActivityUniquinessList();
            uniquinessListElement.setActivityTableType(mapEntry.getKey());
            List<ActivityIDType> idTypes = new ArrayList<>();
            for(IDType idType : mapEntry.getValue()){
                ActivityIDType actIdType = new ActivityIDType();
                actIdType.setIdentifierSchemeId(idType.getSchemeID());
                actIdType.setValue(idType.getValue());
                idTypes.add(actIdType);
            }
            uniquinessListElement.setIds(idTypes);
            uniqList.add(uniquinessListElement);
        }
        if(isEmptyGetNonUniqueIdsRequest(request)){
            return null;
        }
        return request;
    }

    private static boolean isEmptyGetNonUniqueIdsRequest(GetNonUniqueIdsRequest request) {
        boolean isEmpty = true;
        List<ActivityUniquinessList> activityUniquinessLists = request.getActivityUniquinessLists();
        if(activityUniquinessLists == null || activityUniquinessLists.isEmpty()){
            return isEmpty;
        }
        for(ActivityUniquinessList actUnReq : activityUniquinessLists){
            List<ActivityIDType> ids = actUnReq.getIds();
            if(ids != null && !ids.isEmpty()){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public static String mapToSetFLUXFAReportOrQueryMessageRequest(String fluxFAReportMessage, String pluginType, MessageType messageType, SyncAsyncRequestType syncAsyncType, String exchangeLogGuid) throws ActivityModelMarshallException {
        SetFLUXFAReportOrQueryMessageRequest request = new SetFLUXFAReportOrQueryMessageRequest();
        request.setRequestType(syncAsyncType);
        request.setExchangeLogGuid(exchangeLogGuid);
        if (messageType == MessageType.FLUX_FA_REPORT_MESSAGE) {
            request.setMethod(ActivityModuleMethod.GET_FLUX_FA_REPORT);
        } else if (messageType == MessageType.FLUX_FA_QUERY_MESSAGE) {
            request.setMethod(ActivityModuleMethod.GET_FLUX_FA_QUERY);
        }
        request.setPluginType(PluginType.fromValue(pluginType));
        request.setRequest(fluxFAReportMessage);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToActivityGetFishingTripRequest(List<ListValueTypeFilter> listFilter, List<SingleValueTypeFilter> singleFilters) throws ActivityModelMarshallException {
        FishingTripRequest request = new FishingTripRequest();
        request.setMethod(ActivityModuleMethod.GET_FISHING_TRIPS);
        request.setListValueFilters(listFilter);
        request.setSingleValueFilters(singleFilters);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToFaCatchSummaryReportRequestRequest(List<ListValueTypeFilter> listFilter, List<SingleValueTypeFilter> singleFilters, List<GroupCriteria> groupCriterias) throws ActivityModelMarshallException {
        FACatchSummaryReportRequest request = new FACatchSummaryReportRequest();
        request.setMethod(ActivityModuleMethod.GET_FA_CATCH_SUMMARY_REPORT);
        request.setListValueFilters(listFilter);
        request.setSingleValueFilters(singleFilters);
        request.setGroupCriterias(groupCriterias);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToGetFishingActivitiesForTripRequest(List<FishingActivityForTripIds> fishingActivityForTripIds) throws ActivityModelMarshallException {
        GetFishingActivitiesForTripRequest request = new GetFishingActivitiesForTripRequest();
        request.setMethod(ActivityModuleMethod.GET_FISHING_ACTIVITY_FOR_TRIPS);
        request.setFaAndTripIds(fishingActivityForTripIds);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToSubscriptionRequest(String activityMessage, MessageType messageType) throws ActivityModelMarshallException {
        MapToSubscriptionRequest mapToSubscriptionRequest = new MapToSubscriptionRequest();
        mapToSubscriptionRequest.setMethod(ActivityModuleMethod.MAP_TO_SUBSCRIPTION_REQUEST);
        mapToSubscriptionRequest.setRequest(activityMessage);
        switch (messageType){
            case FLUX_FA_REPORT_MESSAGE:
                mapToSubscriptionRequest.setMessageType(MessageType.FLUX_FA_REPORT_MESSAGE);
                break;
            case FLUX_FA_QUERY_MESSAGE:
                mapToSubscriptionRequest.setMessageType(MessageType.FLUX_FA_QUERY_MESSAGE);
                break;
        }
        return JAXBMarshaller.marshallJaxBObjectToString(mapToSubscriptionRequest);
    }
}