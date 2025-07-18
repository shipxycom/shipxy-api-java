package com.elane.request;

import lombok.Data;

@Data
public class GetNavWarningRequest extends BaseObj {
    /**
     * 开始时间
     */
    private String start_time;
    /**
     * 结束时间
     */
    private String end_time;
    /**
     * 警告类型筛选，默认是0，返回全部类型。1军事任务，2船舶演习，3实弹射击，4船舶作业，5航标动态，6船舶搁浅，7船舶试航，8沉没，9人员伤亡，10施工作业，11撤销航警，12其他
     */
    private Integer warning_type;
}
