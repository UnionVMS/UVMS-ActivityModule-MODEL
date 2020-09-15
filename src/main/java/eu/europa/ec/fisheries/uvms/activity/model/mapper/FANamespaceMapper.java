/*
 Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

 This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
 and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
 the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */

package eu.europa.ec.fisheries.uvms.activity.model.mapper;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class FANamespaceMapper extends NamespacePrefixMapper {

    private static final String UDT = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:20";
    private static final String RAM = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:20";
    private static final String RSM = "urn:un:unece:uncefact:data:standard:FLUXResponseMessage:6";

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean b) {
        if(UDT.equalsIgnoreCase(namespaceUri)) {
            return "udt";
        } else if(RAM.equalsIgnoreCase(namespaceUri)) {
            return "ram";
        } else if(RSM.equalsIgnoreCase(namespaceUri)) {
            return "rsm";
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { UDT, RAM, RSM};
    }
}
