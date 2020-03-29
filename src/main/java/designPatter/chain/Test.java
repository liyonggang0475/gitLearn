package designPatter.chain;

/**
 * @Author: liyg
 * @Date: 2020-03-29 15:17
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.addHandler(new ValidateHandler("xxx",  "123"))
                .addHandler(new LoginHandler("liyg",  "123"))
                .addHandler(new AcessHandler("guest"));

        builder.handle();
    }
}
