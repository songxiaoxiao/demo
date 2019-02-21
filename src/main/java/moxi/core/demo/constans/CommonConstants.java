/**
 *
 */
package moxi.core.demo.constans;

/**
 *
 * @author 灯芯科技 李远念
 */
public class CommonConstants {

    public static final String RBAC_NOPRIVILEGE = "无权限操作此功能！";

    public static final String NETWORK_ERROR = "网络异常";

    /**
     * 钱包日志类型
     * */
    public static final String CASH_RECEIPT = "CASH_RECEIPT"; //现金收款
    public static final String NON_CASH_RECEIPT = "NON_CASH_RECEIPT"; //非现金收款
    public static final String RETREAT = "RETREAT"; //退领
    // 	public static final String REFUND="REFUND"; //退款
    //	public static final String MAKE_UP="REFUND"; //补偿
    public static final String WITHDRAW = "WITHDRAW"; //提现
    public static final String TASK = "TASK"; //任务
    public static final String CANCEL_TASK = "CANCEL_TASK"; //撤销任务
    public static final String PENALTY = "PENALTY"; //违约金
    public static final String TRANSFER_MONEY = "TRANSFER_MONEY";//专款转入
    public static final String SPECIAL_TRANSFER = "SPECIAL_TRANSFER";//专款转出


    // 合同计划变动表
    public static final String CONTRACT_PLAN_CONTRACT_SIGNING = "CONTRACT_SIGNING"; //合同签订
    public static final String CONTRACT_PLAN_COMPLETE_TASK = "COMPLETE_TASK"; // 完成任务
    public static final String CONTRACT_PLAN_CANCEL_TASK = "CANCEL_TASK"; //撤销任务
    public static final String CONTRACT_PLAN_CANCEL_GIFT_TASK = "CANCEL_GIFT_TASK"; //撤销赠送任务
    public static final String CONTRACT_PLAN_TERMINATE_TASK = "TERMINATE_TASK"; //任务终止
    public static final String CONTRACT_PLAN_MODIFY_TASK_PRICE = "MODIFY_TASK_PRICE"; //修改任务价格
    public static final String CONTRACT_PLAN_COMPLETE_GIFT_TASK = "COMPLETE_GIFT_TASK"; //完成赠送任务

    /**
     * 验证码类型
     */
    public static final String LOGIN_CAPTCHA_PREFIX = "login_captcha_";
}
