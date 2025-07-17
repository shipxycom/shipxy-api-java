package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.TypeReference;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.elane.params.*;
import com.elane.result.*;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：White
 * https://hiiau7lsqq.feishu.cn/wiki/E0wAwrPpvieGhSk5wLCctNqonVb
 */
public class Shipxy {
    private static String apiUrl = "https://api.shipxy.com/apicall/v3";

    public static String getMethod(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.get(apiUrl + "/" + methodName, paramMap);
        System.out.println(resultStr);
        return resultStr;
    }

    public static String postMethod(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.post(apiUrl + "/" + methodName, paramMap);
        System.out.println(resultStr);
        return resultStr;
    }

    public static JSONObject getMethodJson(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.get(apiUrl + "/" + methodName, paramMap);
        return JSONUtil.parseObj(resultStr);
    }

    public static JSONObject postMethodJson(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.post(apiUrl + "/" + methodName, paramMap);
        return JSONUtil.parseObj(resultStr);
    }

    /**
     * 1船舶查询-1.1船舶模糊查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/VCSYw1FU3iP0zwk2IIFcf2oynPb">在线文档</a></p>
     *
     * @param params SearchShipParams
     * @return
     */
    public static SearchShipResponse SearchShip(SearchParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        JSONObject resultObj = postMethodJson("SearchShip", paramMap);
        return JSONUtil.toBean(resultObj, new TypeReference<SearchShipResponse>() {
        }, true);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-单船位置查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc">在线文档</a></p>
     *
     * @param key  授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return 查看在线文档
     */
    public static SingleShipResponse GetSingleShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetSingleShip", paramMap);
        return JSONUtil.toBean(resultStr, new TypeReference<SingleShipResponse>() {
        }, true);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-多船位置查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc">在线文档</a></p>
     *
     * @param key   授权码：必填，船讯网授权码，验证服务权限
     * @param mmsis 船舶mmsi编号：必填，船舶编号，船舶mmsi编号，多船查询以英文逗号隔开，单次查询船舶数量不超过100
     * @return
     */
    public static ManyShipResponse GetManyShip(String key, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsis", mmsis);
        String resultStr = getMethod("GetManyShip", paramMap);
        return JSONUtil.toBean(resultStr, new TypeReference<ManyShipResponse>() {
        }, true);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-船队船位置查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队编号：必填，控制台中维护的船队id，查询船队下所有船舶数据。
     * @return
     */
    public static FleetShipResponse GetFleetShip(String key, String fleet_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);

        String resultStr = getMethod("GetFleetShip", paramMap);
        return JSONUtil.toBean(resultStr, new TypeReference<FleetShipResponse>() {
        }, true);
    }

    /**
     * 1船舶查询-1.3周边船舶查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/XXTiwDpetivSFhkciWic6qarnOc">在线文档</a></p>
     *
     * @param key  授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return
     */
    public static SurRoundingShipResponse GetSurRoundingShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetSurRoundingShip", paramMap);
        return JSONUtil.toBean(resultStr, new TypeReference<SurRoundingShipResponse>() {
        }, true);

    }

    /**
     * 1船舶查询-1.4区域船舶查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/ZlcrwKpgqik1L3kvbIMcBJUCn1U">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static AreaShipResponse GetAreaShip(GetAreaShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetAreaShip", paramMap);
        return new Gson().fromJson(resultStr, AreaShipResponse.class);
    }

    /**
     * 1船舶查询-1.5船舶船籍查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Ko5gw1o0ZiMQankWEAscSMoin7g">在线文档</a></p>
     *
     * @param key  授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号
     * @return
     */
    public static ShipRegistryResponse GetShipRegistry(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetShipRegistry", paramMap);
        return new Gson().fromJson(resultStr, ShipRegistryResponse.class);
    }

    /**
     * 1船舶查询-1.6船舶档案查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Vvd2wHECliYz6okSoYucTRXvnsd">在线文档</a></p>
     *
     * @param key
     * @param mmsi
     * @return
     */
    public static SearchShipParticularResponse SearchShipParticular(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("SearchShipParticular", paramMap);
        return new Gson().fromJson(resultStr, SearchShipParticularResponse.class);
    }

    /**
     * 2港口查询-2.1港口信息查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/DAlUwEn9Zi50gckSv0uc1qsIn6f">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static SearchPortResponse SearchPort(SearchParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("SearchPort", paramMap);
        return new Gson().fromJson(resultStr, SearchPortResponse.class);
    }

    /**
     * 2港口查询-2.2港口当前靠泊船查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/KdBNwIxOhijpALkCkNXc69MKn3g">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetBerthShipsResponse GetBerthShips(PortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetBerthShips", paramMap);
        return new Gson().fromJson(resultStr, GetBerthShipsResponse.class);
    }

    /**
     * 2港口查询-2.3港口当前到锚船舶查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/WTHnwa66niA4VhkmNVXchRRSnYe">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetAnchorShipsResponse GetAnchorShips(PortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetAnchorShips", paramMap);
        return new Gson().fromJson(resultStr, GetAnchorShipsResponse.class);
    }

    /**
     * 2港口查询-2.4港口预抵船舶查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Poe3wdXkwiwzMUkATcJcigeBnJh">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetETAShipsResponse GetETAShips(GetETAShipsParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetETAShips", paramMap);
        return new Gson().fromJson(resultStr, GetETAShipsResponse.class);
    }

    /**
     * 3历史行为-3.1船舶历史轨迹查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RK2Uwh7tziQ7SnkzlDgcUk8Nnkc">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetShipTrackResponse GetShipTrack(GetShipTrackParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetShipTrack", paramMap);
        return new Gson().fromJson(resultStr, GetShipTrackResponse.class);
    }

    /**
     * 3历史行为-3.2船舶搭靠记录查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/GYrTwxfzRiQdDxkJYOWcF3kKnnf">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static SearchShipApproachResponse SearchshipApproach(SearchshipApproachParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("SearchshipApproach", paramMap);
        return new Gson().fromJson(resultStr, SearchShipApproachResponse.class);
    }

    /**
     * 4挂靠记录-4.1船舶历史挂靠记录
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Sv5rw61KVioV0ekq4ytcBpGgnGd">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetPortOfCallByShipResponse GetPortofCallByShip(GetPortofCallByShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetPortofCallByShip", paramMap);
        return new Gson().fromJson(resultStr, GetPortOfCallByShipResponse.class);
    }

    /**
     * 4挂靠记录-4.2船舶挂靠指定港口记录
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/R01xw8GxYiPd08kGhDeckVojnSC">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetPortOfCallByShipPortResponse GetPortofCallByShipPort(GetPortofCallByShipPortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetPortofCallByShipPort", paramMap);
        return new Gson().fromJson(resultStr, GetPortOfCallByShipPortResponse.class);
    }

    /**
     * 4挂靠记录-4.3船舶当前挂靠信息
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/O3PRwZoAjiX3DdknudicZnVpnxH">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetShipStatusResponse GetShipStatus(GetShipStatusParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetShipStatus", paramMap);
        return new Gson().fromJson(resultStr, GetShipStatusResponse.class);
    }

    /**
     * 4挂靠记录-4.4港口挂靠历史船舶
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/G9BDwzNPqiXdyckzFrBctxYUnHd">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetPortOfCallByPortResponse GetPortofCallByPort(GetPortofCallByPortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("GetPortofCallByPort", paramMap);
        return new Gson().fromJson(resultStr, GetPortOfCallByPortResponse.class);
    }

    /**
     * 5航线规划-5.1点到点航线规划
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/A3UBwJ7pViozTskSFwPcJ4Ldnze">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static PlanRouteByPointResponse PlanRouteByPoint(PlanRouteByPointParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("PlanRouteByPoint", paramMap);
        return new Gson().fromJson(resultStr, PlanRouteByPointResponse.class);
    }

    /**
     * 5航线规划-5.2港到港航线规划
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/NpsbwNzWWiJRy2k79bscVljTntd">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static PlanRouteByPortResponse PlanRouteByPort(PlanRouteByPortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("PlanRouteByPort", paramMap);
        return new Gson().fromJson(resultStr, PlanRouteByPortResponse.class);
    }

    /**
     * 5航线规划-5.3预计到达时间(ETA)查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/NMxnw8fEHiRhrPkIpwTcovdfnOg">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetSingleETAPreciseResponse GetSingleETAPrecise(GetSingleETAPreciseParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetSingleETAPrecise", paramMap);
        return new Gson().fromJson(resultStr, GetSingleETAPreciseResponse.class);
    }

    /**
     * 6气象天气-6.1单点海洋气象
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/AFfAwtwc1ifij6k5JQ9c2u3hnbh">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetWeatherByPointResponse GetWeatherByPoint(GetWeatherByPointParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetWeatherByPoint", paramMap);
        return new Gson().fromJson(resultStr, GetWeatherByPointResponse.class);
    }

    /**
     * 6气象天气-6.2海区气象
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/EEdPwP4kqi10qjkehH5cmK2Onwc">在线文档</a></p>
     *
     * @param key          授权码：必填，船讯网授权码，验证服务权限
     * @param weather_type 区域类型：必填，查询区域的类型：0：全部；1：沿岸；2：近海；3：远海。
     * @return
     */
    public static GetWeatherResponse GetWeather(String key, Integer weather_type) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("weather_type", weather_type);
        String resultStr = getMethod("GetWeather", paramMap);
        return new Gson().fromJson(resultStr, GetWeatherResponse.class);
    }

    /**
     * 6气象天气-6.3全球台风-获取全球台风列表
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/PuWSw4Nteir49WkMccMcryjNnbp">在线文档</a></p>
     *
     * @param key key 授权码：必填，船讯网授权码，验证服务权限
     * @return
     */
    public static GetAllTyphoonResponse GetAllTyphoon(String key) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);

        String resultStr = getMethod("GetAllTyphoon", paramMap);
        return new Gson().fromJson(resultStr, GetAllTyphoonResponse.class);
    }

    /**
     * 6气象天气-6.3全球台风-获取单个台风信息
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/PuWSw4Nteir49WkMccMcryjNnbp">在线文档</a></p>
     *
     * @param key        授权码：必填，船讯网授权码，验证服务权限
     * @param typhoon_id 台风序号：必填，通过查询台风列表获得
     * @return
     */
    public static GetSingleTyphoonResponse GetSingleTyphoon(String key, Integer typhoon_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("typhoon_id", typhoon_id);

        String resultStr = getMethod("GetSingleTyphoon", paramMap);
        return new Gson().fromJson(resultStr, GetSingleTyphoonResponse.class);
    }

    /**
     * 6气象天气-6.4国内港口潮汐-查询国内潮汐观测站列表
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Ayoiw98eSi0PrpkZnLnclCy8nzd">在线文档</a></p>
     *
     * @param key key 授权码：必填，船讯网授权码，验证服务权限
     * @return
     */
    public static GetTidesResponse GetTides(String key) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);

        String resultStr = getMethod("GetTides", paramMap);
        return new Gson().fromJson(resultStr, GetTidesResponse.class);
    }

    /**
     * 6气象天气-6.4国内港口潮汐-查询国内潮汐观测站列表
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/Ayoiw98eSi0PrpkZnLnclCy8nzd">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetTideDataResponse GetTideData(GetTideDataParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetTideData", paramMap);
        return new Gson().fromJson(resultStr, GetTideDataResponse.class);
    }

    /**
     * 8海事数据-8.1航行警告查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/DCgdwVip5ifCpAkQ3lfcq8OEnOc">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static GetNavWarningResponse GetNavWarning(GetNavWarningParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = getMethod("GetNavWarning", paramMap);
        return new Gson().fromJson(resultStr, GetNavWarningResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-创建船队
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static FleetResponse AddFleet(AddFleetParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = postMethod("AddFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-更新船队信息
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static FleetResponse UpdateFleet(UpdateFleetParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);

        String resultStr = postMethod("UpdateFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-查询船队
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队id：必填，船队的ID，用来对船队信息进行维护的唯一标识。
     * @return
     */
    public static FleetResponse GetFleet(String key, String fleet_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        String resultStr = getMethod("GetFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-删除船队
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队id：必填，船队的ID，用来对船队信息进行维护的唯一标识。
     * @return
     */
    public static BaseResponse DeleteFleet(String key, String fleet_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);

        String resultStr = postMethod("DeleteFleet", paramMap);
        return new Gson().fromJson(resultStr, BaseResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-船队船舶增加
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队id：必填，船队的ID，用来对船队信息进行维护的唯一标识。
     * @param mmsis    船舶清单：必填，添加船队管理的船舶，mmsi编号，以英文逗号隔开。增量更新，不变动原有船队船舶，输入的mmsi编号与原有重复时，新填入的不会增加到船队中。
     * @return
     */
    public static FleetResponse AddFleetShip(String key, String fleet_id, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        paramMap.put("mmsis", mmsis);
        String resultStr = postMethod("AddFleetShip", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-船队船舶批量更新
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队id：必填，船队的ID，用来对船队信息进行维护的唯一标识。
     * @param mmsis    船舶清单：必填，添加船队管理的船舶，mmsi编号，以英文逗号隔开。增量更新，不变动原有船队船舶，输入的mmsi编号与原有重复时，新填入的不会增加到船队中。
     * @return
     */
    public static FleetResponse UpdateFleetShip(String key, String fleet_id, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        paramMap.put("mmsis", mmsis);
        String resultStr = postMethod("UpdateFleetShip", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-船队船舶删除
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队id：必填，船队的ID，用来对船队信息进行维护的唯一标识。
     * @param mmsis    船舶清单：必填，添加船队管理的船舶，mmsi编号，以英文逗号隔开。删除船队管理的某一只或一批船舶，只删除现有船队中已有的船舶信息，船队中没有的船舶编号输入后，不会影响其他船舶。
     * @return
     */
    public static FleetResponse DeleteFleetShip(String key, String fleet_id, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        paramMap.put("mmsis", mmsis);

        String resultStr = postMethod("DeleteFleetShip", paramMap);
        return new Gson().fromJson(resultStr, FleetResponse.class);
    }

    /**
     * 9监控推送-9.1监控船队管理-区域创建
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static JSONObject AddArea(AddAreaParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return postMethodJson("AddArea", paramMap);
    }

    /**
     * 9监控推送-9.1监控船队管理-区域更新
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param params
     * @return
     */
    public static JSONObject UpdateArea(UpdateAreaParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return postMethodJson("UpdateArea", paramMap);
    }

    /**
     * 9监控推送-9.1监控船队管理-区域查询
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key     授权码：必填，船讯网授权码，验证服务权限
     * @param area_id 区域的ID：必填，区域的id，唯一标识，用来对区域的删改查
     * @return
     */
    public static JSONObject GetArea(String key, String area_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("area_id", area_id);
        return postMethodJson("GetArea", paramMap);
    }

    /**
     * 9监控推送-9.1监控船队管理-区域删除
     * <p><a href="https://hiiau7lsqq.feishu.cn/wiki/RtL0w0iHDioEP6kvZcScIC95nSe">在线文档</a></p>
     *
     * @param key     授权码：必填，船讯网授权码，验证服务权限
     * @param area_id 区域的ID：必填，区域的id，唯一标识，用来对区域的删改查
     * @return
     */
    public static JSONObject DeleteArea(String key, String area_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("area_id", area_id);
        return postMethodJson("DeleteArea", paramMap);
    }
}
