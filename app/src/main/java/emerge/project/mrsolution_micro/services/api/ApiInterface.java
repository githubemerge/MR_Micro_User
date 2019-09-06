package emerge.project.mrsolution_micro.services.api;


import com.google.gson.JsonObject;

import java.util.ArrayList;

import emerge.project.mrsolution_micro.utils.entittes.District;
import emerge.project.mrsolution_micro.utils.entittes.Doctor;
import emerge.project.mrsolution_micro.utils.entittes.LocationEntitie;
import emerge.project.mrsolution_micro.utils.entittes.LoginUser;
import emerge.project.mrsolution_micro.utils.entittes.Products;
import emerge.project.mrsolution_micro.utils.entittes.Specialization;
import emerge.project.mrsolution_micro.utils.entittes.TargetDetails;
import emerge.project.mrsolution_micro.utils.entittes.Visit;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("User/ValidateUser")
    Observable<LoginUser> validateUser(@Query("username") String username, @Query("password") String password, @Query("usertypeID") int usertypeID, @Query("pushtokenid") String pushtokenid);


    @GET("Visit/GetAllVisitsByMR")
    Observable<ArrayList<Visit>> getAllVisits(@Query("MRID") int mrID, @Query("LocationID") int LocationID, @Query("DoctorID") int DoctorID, @Query("Date") String Date);


    @GET("Doctor/GetApprovedDoctorsNearLocation")
    Observable<ArrayList<Doctor>> getApprovedDoctorsNearLocation(@Query("MRID") int mrID, @Query("Latitude") double latitude, @Query("Longitude") double longitude);



    @GET("Location/GetNearbyLocationsOfDoctor")
    Observable<ArrayList<LocationEntitie>> getNearbyLocationsOfDoctor(@Query("DoctorID") int docID, @Query("Latitude") double latitude, @Query("Longitude") double longitude);


    @GET("Product/GetAllProductsForMR")
    Observable<ArrayList<Products>> getAllProductsForMR(@Query("MRID") int mrID);



    @POST("Visit/SaveVisit")
    Observable<Visit> saveVisit(@Body JsonObject doctorInfo);


    @GET("Location/GetAllLocationsByMR")
    Observable<ArrayList<LocationEntitie>> getAllLocationsByMR(@Query("TokenID") String tokenID, @Query("MRID") int mrID);


    @GET("District/GetAllDistricts")
    Observable<ArrayList<District>> getAllDistricts(@Query("TokenID") String tokenID);

    @POST("Location/SaveLocation")
    Observable<ArrayList<LocationEntitie>> saveLocation(@Body JsonObject locationInfo);


    @GET("Doctor/GetAllDoctors")
    Observable<ArrayList<Doctor>> getAllDoctors(@Query("TokenID") String tokenID, @Query("MRID") int mrID);


    @GET("Specialization/GetApprovedSpecializations")
    Observable<ArrayList<Specialization>> getApprovedSpecializations(@Query("TokenID") String tokenID);



    @POST("Doctor/SaveDoctor")
    Observable<ArrayList<Doctor>> saveDoctor(@Body JsonObject doctorInfo);


    @POST("Visit/SaveVisitImage")
    Observable<Boolean> saveVisitImage(@Body JsonObject visitImage);


    @GET("TargetAchievement/GetTargetAchievement")
    Observable<TargetDetails> getTargetAchievement(@Query("mrid") int mrID);




}
