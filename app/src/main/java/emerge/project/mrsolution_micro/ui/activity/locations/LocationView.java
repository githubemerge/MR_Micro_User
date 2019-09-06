package emerge.project.mrsolution_micro.ui.activity.locations;


import java.util.ArrayList;

import emerge.project.mrsolution_micro.utils.entittes.District;
import emerge.project.mrsolution_micro.utils.entittes.LocationEntitie;


/**
 * Created by Himanshu on 4/4/2017.
 */

public interface LocationView {

    void locationList(ArrayList<LocationEntitie> locationArrayList);

    void noLocation();

    void locationFail(String failMsg);

    void locationNetworkFail();


    void districtList(ArrayList<District> districtArrayList, ArrayList<String> districtNameList);
    void noDistrict();
    void districtFail(String failMsg);
    void districtNetworkFail();


    void selectedDistrictID(int selectedDsistrictId);

    void  postLocationError(String msg);
    void  postLocationSuccess();
    void  postLocationFail(String failMsg,LocationEntitie location,int isAfterSuggestion);
    void  postLocationDuplicate(ArrayList<LocationEntitie> duplicateLocationList, LocationEntitie locationEntitie,int isAfterSuggestion);
    void  postLocationNetworkFail();



}
