# 亿海蓝-船讯网-sdk
[亿海蓝官网](https://www.shipxy.com/)&nbsp;&nbsp;
[API控制台](https://api.shipxy.com/v3/console/index)&nbsp;&nbsp;
[在线开发文档](https://hiiau7lsqq.feishu.cn/wiki/E0wAwrPpvieGhSk5wLCctNqonVb)&nbsp;&nbsp;
[github](https://github.com/shipxycom/shipxy-api-java)&nbsp;&nbsp;
[gitee](https://gitee.com/shipxycom/shipxy-api-java)&nbsp;&nbsp;

## 示例用法
```
import cn.hutool.json.JSONObject;
import com.elane.api.Shipxy;

public class Main {
    private static String key = "请从 API控制台 申请";

    public static void main(String[] args) {
        JSONObject result = Shipxy.GetManyShip(key, "413961925,477232800,477172700");
        System.out.println(result);
    }
}

```

## 开发者在使用过程中如有疑问，可以通过以下方式联系船讯网：

• 商务邮箱：support@shipxy.com

• 技术支持邮箱：service@shipxy.com

• 电话：400-010-8558

![飞书](./images/飞书.jpg)
![微信](./images/微信.jpg)