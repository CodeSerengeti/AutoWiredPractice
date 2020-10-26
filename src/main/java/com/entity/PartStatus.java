package com.entity;

/**This is a class to describe the status of a part, this is determined by ProcessCtoller.
 * PASS:                        test result is PASS on queried station
 * FAILED:                      test result is FAILED on queried station
 *  NOT_REACH_STATION:          the part has not reach the queried station
 *  NOT_FOUND:                  the part number is not foudn in datbase
 *  DEFAULT:                    a default value, no meanning
 *  NOT_IN_ORDER:               the part is not in the current active order
 *  PART_NUMBER_EMPTY:          the part number string is empty
 *  QUERY_STATION_NNAME_EMPTY:  the station name is empty when tying to query the database
 */
public enum PartStatus {
    PASS,FAILED, NOT_REACH_STATION,NOT_FOUND,DEFAULT,NOT_IN_ORDER, PART_NUMBER_EMPTY,QUERY_STATION_NNAME_EMPTY;


}
