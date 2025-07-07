package com.elane;

import cn.hutool.json.JSONObject;
import com.elane.api.Shipxy;
import com.elane.params.*;

public class Main {
    private static String key = "484db43a65ec4f87b5b4dcc69e586bf7";

    public static void main(String[] args) {
//        SearchShipFn();
//        GetSingleShipFn();
//        GetManyShipFn();
//        GetFleetShipFn();
//        GetSurRoundingShipFn();
//        GetAreaShipFn();
//        GetShipRegistryFn();
//        SearchShipParticularFn();

//        SearchPortFn();
//        GetBerthShipsFn();
//        GetAnchorShipsFn();

//        GetETAShipsFn();
//        GetShipTrackFn();
//        SearchshipApproachFn();

//        GetPortofCallByShipFn();
//        GetPortofCallByShipPortFn();
//        GetShipStatusFn();
//        GetPortofCallByPortFn();

//        PlanRouteByPointFn();
//        PlanRouteByPortFn();
//        GetSingleETAPreciseFn();

//        GetWeatherByPointFn();
//        GetWeatherFn();
//        GetAllTyphoonFn();
//        GetSingleTyphoonFn();
//        GetTidesFn();
//        GetTideDataFn();

//        GetNavWarningFn();

//        AddFleetFn();
//        UpdateFleetFn();
//        GetFleetFn();
//        DeleteFleetFn();
//        AddFleetShipFn();
//        UpdateFleetShipFn();
//        DeleteFleetShipFn();
//        AddAreaFn();
//        UpdateAreaFn();
//        GetAreaFn();
//        DeleteAreaFn();
    }


    public static void SearchShipFn() {
        SearchParams params = new SearchParams();
        params.setKey(key);
        params.setKeywords("cosco");
        params.setMax(2);
        JSONObject result = Shipxy.SearchShip(params);
        System.out.println(result);
    }

    public static void GetSingleShipFn() {
        JSONObject result = Shipxy.GetSingleShip(key, 413961925);
        System.out.println(result);
    }

    public static void GetManyShipFn() {
        JSONObject result = Shipxy.GetManyShip(key, "413961925,477232800,477172700");
        System.out.println(result);
    }

    public static void GetFleetShipFn() {
        JSONObject result = Shipxy.GetFleetShip(key, "72efa1dc-dc1d-45a6-9090-880835105363");
        System.out.println(result);
    }

    public static void GetSurRoundingShipFn() {
        JSONObject result = Shipxy.GetSurRoundingShip(key, 413961925);
        System.out.println(result);
    }

    public static void GetAreaShipFn() {
        GetAreaShipParams params = new GetAreaShipParams();
        params.setKey(key);
        params.setRegion("121.289063,35.424868-122.783203,35.281501-122.167969,33.979809");
        JSONObject result = Shipxy.GetAreaShip(params);
        System.out.println(result);
    }

    public static void GetShipRegistryFn() {
        JSONObject result = Shipxy.GetShipRegistry(key, 413961925);
        System.out.println(result);
    }

    public static void SearchShipParticularFn() {
        JSONObject result = Shipxy.SearchShipParticular(key, 477172700);
        System.out.println(result);
    }

    public static void SearchPortFn() {
        SearchParams params = new SearchParams();
        params.setKey(key);
        params.setKeywords("CNS");
        JSONObject result = Shipxy.SearchPort(params);
        System.out.println(result);
    }

    public static void GetBerthShipsFn() {
        PortParams params = new PortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
//        params.setShip_type(52);
        JSONObject result = Shipxy.GetBerthShips(params);
        System.out.println(result);
    }

    public static void GetAnchorShipsFn() {
        PortParams params = new PortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
//        params.setShip_type(52);
        JSONObject result = Shipxy.GetAnchorShips(params);
        System.out.println(result);
    }

    public static void GetETAShipsFn() {
        GetETAShipsParams params = new GetETAShipsParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.GetETAShips(params);
        System.out.println(result);
    }

    public static void GetShipTrackFn() {
        GetShipTrackParams params = new GetShipTrackParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.GetShipTrack(params);
        System.out.println(result);
    }

    public static void SearchshipApproachFn() {
        SearchshipApproachParams params = new SearchshipApproachParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.SearchshipApproach(params);
        System.out.println(result);
    }

    public static void GetPortofCallByShipFn() {
        GetPortofCallByShipParams params = new GetPortofCallByShipParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByShip(params);
        System.out.println(result);
    }

    public static void GetPortofCallByShipPortFn() {
        GetPortofCallByShipPortParams params = new GetPortofCallByShipPortParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByShipPort(params);
        System.out.println(result);
    }

    public static void GetShipStatusFn() {
        GetShipStatusParams params = new GetShipStatusParams();
        params.setKey(key);
        params.setMmsi(477172700);
        JSONObject result = Shipxy.GetShipStatus(params);
        System.out.println(result);
    }

    public static void GetPortofCallByPortFn() {
        GetPortofCallByPortParams params = new GetPortofCallByPortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByPort(params);
        System.out.println(result);
    }

    public static void PlanRouteByPointFn() {
        PlanRouteByPointParams params = new PlanRouteByPointParams();
        params.setKey(key);
        params.setStart_point("113.571144,22.844316");
        params.setEnd_point("121.58414,31.37979");
        JSONObject result = Shipxy.PlanRouteByPoint(params);
        System.out.println(result);
    }

    public static void PlanRouteByPortFn() {
        PlanRouteByPortParams params = new PlanRouteByPortParams();
        params.setKey(key);
        params.setStart_port_code("CNGZG");
        params.setEnd_port_code("CNSHG");
        JSONObject result = Shipxy.PlanRouteByPort(params);
        System.out.println(result);
    }

    public static void GetSingleETAPreciseFn() {
        GetSingleETAPreciseParams params = new GetSingleETAPreciseParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        JSONObject result = Shipxy.GetSingleETAPrecise(params);
        System.out.println(result);
    }

    public static void GetWeatherByPointFn() {
        GetWeatherByPointParams params = new GetWeatherByPointParams();
        params.setKey(key);
        params.setLng(123.58414);
        params.setLat(27.37979);
        JSONObject result = Shipxy.GetWeatherByPoint(params);
        System.out.println(result);
    }

    public static void GetWeatherFn() {
        JSONObject result = Shipxy.GetWeather(key, 1);
        System.out.println(result);
    }

    public static void GetAllTyphoonFn() {
        JSONObject result = Shipxy.GetAllTyphoon(key);
        System.out.println(result);
    }

    public static void GetSingleTyphoonFn() {
        JSONObject result = Shipxy.GetSingleTyphoon(key, 2477927);
        System.out.println(result);
    }

    public static void GetTidesFn() {
        JSONObject result = Shipxy.GetTides(key);
        System.out.println(result);
    }

    public static void GetTideDataFn() {
        GetTideDataParams params = new GetTideDataParams();
        params.setKey(key);
        params.setPort_code("8000005");
        params.setStart_date("2025-03-01");
        params.setEnd_date("2025-03-05");
        JSONObject result = Shipxy.GetTideData(params);
        System.out.println(result);
    }

    public static void GetNavWarningFn() {
        GetNavWarningParams params = new GetNavWarningParams();
        params.setKey(key);
        params.setStart_time("2024-07-21 20:00");
        params.setEnd_time("2024-09-21 20:00");
        params.setWarning_type(1);
        JSONObject result = Shipxy.GetNavWarning(params);
        System.out.println(result);
    }

    public static void AddFleetFn() {
        AddFleetParams params = new AddFleetParams();
        params.setKey(key);
        params.setFleet_name("测试船队11");
        params.setMmsis("477985700,412751690");
        params.setMonitor("6");
        JSONObject result = Shipxy.AddFleet(params);
        System.out.println(result);
    }

    public static void UpdateFleetFn() {
        UpdateFleetParams params = new UpdateFleetParams();
        params.setKey(key);
        params.setFleet_id("6db8d8ec-858d-4417-86c0-666d61e340bf");
        params.setFleet_name("测试船队");
        params.setMmsis("477985700");
        params.setMonitor("6");
        JSONObject result = Shipxy.UpdateFleet(params);
        System.out.println(result);
    }

    public static void GetFleetFn() {
        JSONObject result = Shipxy.GetFleet(key,"6db8d8ec-858d-4417-86c0-666d61e340bf");
        System.out.println(result);
    }

    public static void DeleteFleetFn() {
        JSONObject result = Shipxy.DeleteFleet(key,"78007616-5fc9-4ef3-b706-7e60aa30b40d");
        System.out.println(result);
    }

    public static void AddFleetShipFn() {
        JSONObject result = Shipxy.AddFleetShip(key,"6db8d8ec-858d-4417-86c0-666d61e340bf","477985700,412751690");
        System.out.println(result);
    }

    public static void UpdateFleetShipFn() {
        JSONObject result = Shipxy.AddFleetShip(key,"6db8d8ec-858d-4417-86c0-666d61e340bf","477985700,412751690");
        System.out.println(result);
    }

    public static void DeleteFleetShipFn() {
        JSONObject result = Shipxy.DeleteFleetShip(key,"6db8d8ec-858d-4417-86c0-666d61e340bf","477985700,412751690");
        System.out.println(result);
    }

    public static void AddAreaFn() {
        AddAreaParams params = new AddAreaParams();
        params.setKey(key);
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("浙江沿海区域1");
        params.setUrl("http://192.186.1.1:8000/shipxy/testdemo");
        params.setFilter_type(3);
//        params.setShip_type("59");
        params.setFleet_id("6db8d8ec-858d-4417-86c0-666d61e340bf");
        JSONObject result = Shipxy.AddArea(params);
        System.out.println(result);
    }

    public static void UpdateAreaFn() {
        UpdateAreaParams params = new UpdateAreaParams();
        params.setKey(key);
        params.setArea_id("4503ca40-a901-4784-8e5b-b80174315f8f");
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("浙江沿海区域11");
        params.setUrl("http://192.186.1.1:8000/shipxy/testdemo");
        params.setFilter_type(3);
//        params.setShip_type("59");
        params.setFleet_id("6db8d8ec-858d-4417-86c0-666d61e340bf");
        JSONObject result = Shipxy.UpdateArea(params);
        System.out.println(result);
    }

    public static void GetAreaFn() {
        JSONObject result = Shipxy.GetArea(key,"4503ca40-a901-4784-8e5b-b80174315f8f");
        System.out.println(result);
    }

    public static void DeleteAreaFn() {
        JSONObject result = Shipxy.DeleteArea(key,"4503ca40-a901-4784-8e5b-b80174315f8f");
        System.out.println(result);
    }
}