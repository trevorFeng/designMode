package delegate;
/*
 *
 * @author LiuBing
 * @date 2018/8/28 9:29
 */

public class TargetB implements ITarget {
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
