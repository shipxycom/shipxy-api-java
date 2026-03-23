package com.elane;

import com.elane.api.Shipxy;
import com.elane.request.*;
import com.elane.response.*;

public class Main {
    private static String key = com.elane.api.Key.key;
//    private static String key = "请从 API控制台 申请";

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
        GetAllTyphoonFn();
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
        SearchRequest params = new SearchRequest();
        params.setKey(key);
        params.setKeywords("coco");
        params.setMax(2);
        SearchShipResponse result = Shipxy.SearchShip(params);
        System.out.println(result);
        if(result.getData()!=null){
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void GetSingleShipFn() {
        SingleShipResponse result = Shipxy.GetSingleShip(key, 413961925);
        System.out.println(result);
        if(result.getData()!=null){
            System.out.println(result.getData().getMmsi());
        }
    }

    public static void GetManyShipFn() {
        ManyShipResponse result = Shipxy.GetManyShip(key, "413961925,477232800,477172700");
        System.out.println(result);
        if(result.getData()!=null){
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void GetFleetShipFn() {
        FleetShipResponse result = Shipxy.GetFleetShip(key, "0372ec4c-eead-49ce-b005-6ffa731cc1df");
        System.out.println(result);
        if(result.getData()!=null){
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void GetSurRoundingShipFn() {
        SurRoundingShipResponse result = Shipxy.GetSurRoundingShip(key, 413961925);
        System.out.println(result);
        if(result.getData()!=null){
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void GetAreaShipFn() {
        GetAreaShipRequest params = new GetAreaShipRequest();
        params.setKey(key);
        params.setRegion("121.289063,35.424868-122.783203,35.281501-122.167969,33.979809");
        AreaShipResponse result = Shipxy.GetAreaShip(params);
        System.out.println(result);
        System.out.println(result.getData().getShipList().get(0).getMmsi());
    }

    public static void GetShipRegistryFn() {
        ShipRegistryResponse result = Shipxy.GetShipRegistry(key, 413961925);
        System.out.println(result);
        System.out.println(result.getData().getRegistry());
    }

    public static void SearchShipParticularFn() {
        SearchShipParticularResponse result = Shipxy.SearchShipParticular(key, 477172700);
        System.out.println(result);
        System.out.println(result.getData().get(0).getMmsi());
        System.out.println(result.getData().get(0).getMainEngineList().get(0).getDesigner());
    }

    public static void SearchPortFn() {
        SearchRequest params = new SearchRequest();
        params.setKey(key);
        params.setKeywords("CNS");
        SearchPortResponse result = Shipxy.SearchPort(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getPortCode());
    }

    public static void GetBerthShipsFn() {
        PortRequest params = new PortRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setShip_type(99);
        GetBerthShipsResponse result = Shipxy.GetBerthShips(params);
        System.out.println(result);
        if(result.getTotal()>0){
            System.out.println(result.getData().get(0).getMmsi());
        }

    }

    public static void GetAnchorShipsFn() {
        PortRequest params = new PortRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setShip_type(52);
        GetAnchorShipsResponse result = Shipxy.GetAnchorShips(params);
        System.out.println(result);
    }

    public static void GetETAShipsFn() {
        GetETAShipsRequest params = new GetETAShipsRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        GetETAShipsResponse result = Shipxy.GetETAShips(params);
        System.out.println(result);
    }

    public static void GetShipTrackFn() {
        GetShipTrackRequest params = new GetShipTrackRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        GetShipTrackResponse result = Shipxy.GetShipTrack(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getUtc());
    }

    public static void SearchshipApproachFn() {
        SearchshipApproachRequest params = new SearchshipApproachRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        SearchShipApproachResponse result = Shipxy.SearchshipApproach(params);
        System.out.println(result);
        System.out.println(result.getData().getApproachData().get(0).getApproachShip().getShipName());
    }

    public static void GetPortofCallByShipFn() {
        GetPortofCallByShipRequest params = new GetPortofCallByShipRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        GetPortOfCallByShipResponse result = Shipxy.GetPortofCallByShip(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getShipName());
    }

    public static void GetPortofCallByShipPortFn() {
        GetPortofCallByShipPortRequest params = new GetPortofCallByShipPortRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        GetPortOfCallByShipPortResponse result = Shipxy.GetPortofCallByShipPort(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getShipName());
    }

    public static void GetShipStatusFn() {
        GetShipStatusRequest params = new GetShipStatusRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        GetShipStatusResponse result = Shipxy.GetShipStatus(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getMmsi());
    }

    public static void GetPortofCallByPortFn() {
        GetPortofCallByPortRequest params = new GetPortofCallByPortRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1751440300);
        params.setEnd_time(1751440378);
        GetPortOfCallByPortResponse result = Shipxy.GetPortofCallByPort(params);
        System.out.println(result);
        System.out.println(result.getData().get(0).getMmsi());
    }

    public static void PlanRouteByPointFn() {
        PlanRouteByPointRequest params = new PlanRouteByPointRequest();
        params.setKey(key);
        params.setStart_point("113.571144,22.844316");
        params.setEnd_point("121.58414,31.37979");
        PlanRouteByPointResponse result = Shipxy.PlanRouteByPoint(params);
        System.out.println(result);
        System.out.println(result.getData().getRoute().get(0).getLng());
    }

    public static void PlanRouteByPortFn() {
        PlanRouteByPortRequest params = new PlanRouteByPortRequest();
        params.setKey(key);
        params.setStart_port_code("CNGZG");
        params.setEnd_port_code("CNSHG");
        PlanRouteByPortResponse result = Shipxy.PlanRouteByPort(params);
        System.out.println(result);
        System.out.println(result.getData().getRoute().get(0).getLng());
    }

    public static void GetSingleETAPreciseFn() {
        GetSingleETAPreciseRequest params = new GetSingleETAPreciseRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        GetSingleETAPreciseResponse result = Shipxy.GetSingleETAPrecise(params);
        System.out.println(result);
        System.out.println(result.getData().getNextport().getAisSpeed());
    }

    public static void GetWeatherByPointFn() {
        GetWeatherByPointRequest params = new GetWeatherByPointRequest();
        params.setKey(key);
        params.setLng(123.58414);
        params.setLat(27.37979);
        GetWeatherByPointResponse result = Shipxy.GetWeatherByPoint(params);
        System.out.println(result);
        System.out.println(result.getData().getPublishTime());
    }

    public static void GetWeatherFn() {
        GetWeatherResponse result = Shipxy.GetWeather(key, 1);
        System.out.println(result);
        System.out.println(result.getData().get(0).getSeaArea());
    }

    public static void GetAllTyphoonFn() {
        GetAllTyphoonResponse result = Shipxy.GetAllTyphoon(key);
        System.out.println(result);
        System.out.println(result.getData().get(0).getTyphoonCnname());
    }

    public static void GetSingleTyphoonFn() {
        GetSingleTyphoonResponse result = Shipxy.GetSingleTyphoon(key, 2477927);
        System.out.println(result);
        System.out.println(result.getData().get(0).getTyphoonTime());
    }

    public static void GetTidesFn() {
        GetTidesResponse result = Shipxy.GetTides(key);
        System.out.println(result);
        System.out.println(result.getData().get(0).getPortCnname());
    }

    public static void GetTideDataFn() {
        GetTideDataRequest params = new GetTideDataRequest();
        params.setKey(key);
        params.setPort_code("8000005");
        params.setStart_date("2025-03-01");
        params.setEnd_date("2025-03-05");
        GetTideDataResponse result = Shipxy.GetTideData(params);
        System.out.println(result);
        System.out.println(result.getData().getOverview().get(0).getTideHeight2());
        System.out.println(result.getData().getDetail().get(0).getH4());
    }

    public static void GetNavWarningFn() {
        GetNavWarningRequest params = new GetNavWarningRequest();
        params.setKey(key);
        params.setStart_time("2024-07-21 20:00");
        params.setEnd_time("2024-09-21 20:00");
        params.setWarning_type(1);
        GetNavWarningResponse result = Shipxy.GetNavWarning(params);
//        System.out.println(result);
        System.out.println(result.getData().get(0).getTitle());
    }

    public static void AddFleetFn() {
        AddFleetRequest params = new AddFleetRequest();
        params.setKey(key);
        params.setFleet_name("测试船队11");
        params.setMmsis("477985700,412751690");
        params.setMonitor("6");
        FleetResponse result = Shipxy.AddFleet(params);
        System.out.println(result);
    }

    public static void UpdateFleetFn() {
        UpdateFleetRequest params = new UpdateFleetRequest();
        params.setKey(key);
        params.setFleet_id("0372ec4c-eead-49ce-b005-6ffa731cc1df");
        params.setFleet_name("测试船队");
        params.setMmsis("477985709");
        params.setMonitor("6");
        FleetResponse result = Shipxy.UpdateFleet(params);
        System.out.println(result);
    }

    public static void GetFleetFn() {
        FleetResponse result = Shipxy.GetFleet(key,"0372ec4c-eead-49ce-b005-6ffa731cc1df");
        System.out.println(result);
    }

    public static void DeleteFleetFn() {
        BaseResponse result = Shipxy.DeleteFleet(key,"f777007b-fb88-4c4c-b4eb-db33e84e99ee");
        System.out.println(result);
    }

    public static void AddFleetShipFn() {
        FleetResponse result = Shipxy.AddFleetShip(key,"0372ec4c-eead-49ce-b005-6ffa731cc1df","477985700,412751690");
        System.out.println(result);
    }

    public static void UpdateFleetShipFn() {
        FleetResponse result = Shipxy.UpdateFleetShip(key,"0372ec4c-eead-49ce-b005-6ffa731cc1df","477985706,412751696");
        System.out.println(result);
    }

    public static void DeleteFleetShipFn() {
        FleetResponse result = Shipxy.DeleteFleetShip(key,"0372ec4c-eead-49ce-b005-6ffa731cc1df","477985706");
        System.out.println(result);
    }

    public static void AddAreaFn() {
        AddAreaRequest params = new AddAreaRequest();
        params.setKey(key);
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("浙江沿海区域1");
        params.setUrl("http://192.186.1.1:8000/shipxy/testdemo");
        params.setFilter_type(3);
//        params.setShip_type("59");
        params.setFleet_id("0372ec4c-eead-49ce-b005-6ffa731cc1df");
        AreaResponse result = Shipxy.AddArea(params);
        System.out.println(result);
    }

    public static void UpdateAreaFn() {
        UpdateAreaRequest params = new UpdateAreaRequest();
        params.setKey(key);
        params.setArea_id("b7a40fa4-daae-4586-a56a-b09457331628");
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("浙江沿海区域11");
        params.setUrl("http://192.186.1.1:8000/shipxy/testdemo");
        params.setFilter_type(3);
//        params.setShip_type("59");
        params.setFleet_id("6db8d8ec-858d-4417-86c0-666d61e340bf");
        AreaResponse result = Shipxy.UpdateArea(params);
        System.out.println(result);
    }

    public static void GetAreaFn() {
        AreaResponse result = Shipxy.GetArea(key,"b7a40fa4-daae-4586-a56a-b09457331628");
        System.out.println(result);
    }

    public static void DeleteAreaFn() {
        BaseResponse result = Shipxy.DeleteArea(key,"c18525d5-ac35-42eb-bee7-c791261d908d");
        System.out.println(result);
    }
}