package org.hzdb.trade.controller;

public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016091800536815";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCSWNiA31z7fnJVQwigTAU7Cpgf7wzptoCuQ2bVACX7COrxKIQd5a0LN7ZMIGPr0oSZnLhP3o/q5NLcuANXgMGpbOftZjcbCWhCiAscJNKJmg43c5YQes3ePV9M1jInf/aAXKUPUggkXGjMnumpzySgVJOv/pM4+AqdbtSfs2DH1Nm4aXsFeHO3mjfg/TFx6tq7A+rO8hZw4LEQEkqfHFKOEJat8SCynxyWdqMkScyRD0E0cz7YFIDvJQNjcn1bVyzp8Q9PK3IJMU+LpqB5td+ZLOrPLLV70G6TLsPFBnU5+uLk7c9Bt75wGofsEGp4BOdTmcrq42E6HIx4sGw9YQtXAgMBAAECggEAVdIEJI7X2COuqJFG3bm214i+7Psid2uuyoJ8KyyLGUuBeypnT6EAeTOSk9HqxsANQofFDhFWFElb3lOKoiW/a7uRxoXKivBZU6qz2S0+ybKt45bEyaU6VLloyYZSoxdHVr79jJ5uZ+RJELWgERSIRf1THkIL07yhfPEhfwWSG5yzYaA11Ly5RPgRpH5mo4aolVCamTzO0FYkIhItu3ixn9p/RdoPE8OMMxqGsyjmCfBYD4AGUdqD03KN7BSAcDZCG1cUbl17jBVgvNMmO7WBW8KPycuQQPPPHyhpov2oKu9qCWwPhoG5TH1zh8gdnoj5XzHnVB/b/3T34AKNAFHgAQKBgQDJJwDE29dJGEDnAJmWDw+0DCwTCh29FFO1M3H8CHruY2I9CCywxHBxs8XwbfkrahsCOxEVpWo6FwzP1xoEBgWH7Y3A6JLR/ubmGnSHCfwfVOgM7xwCN7m80LOxX+UWtnyeMBqJEEnbUj4/LjrY6qfnokYJZzjR9Jy0v66wB5XKgQKBgQC6QEeEJQeZ4OKmlofE8E2I+X42IZwFt4kCvBPx/OcBhnhtd/u34ow+PQYAbD77niwUWBPJlcboiUp/OkO252R+SZh9eM7p8QaK/+CnTJVSKc/EbWseL8/R0eJkz3JLRbvxn5Nf3Hp287efCOThOmbbnW23q0Pso2NWaRxLAV151wKBgAPzPyGei5jE4ClpKpr2ysEnaAorra/T4VzymK9xXzClRP2b1nzWLrsc46s4DaebmtItZMV/DRn87+R4/erMT3l+4cTDDHcRQWmNZXJtcMUQvsnaPDuS6pPZqV23W2FZzhKxMSQ17K1g7RYCi2dNHGUBG8z9ePEuk5E9HmoYjAmBAoGAC1kJQnLjIKwEAzRet1AQ2UyiNPgdQnfpQCJncLIA/SXNRpYt3wlNlCkxqWru93Ouqdqn8ftPMDHVOSU6pPU6OTuQr+xhZv2JcYSfknHnEyd7AjPMd/1fwx/vlEbTZuSry8/2MbwENiUpReZL07E0PSM9YRhtPgjCb6xdzfAaWucCgYEAsBb+UWCGYK12OPVm6pHwCqk2ZKHaBcTCNai5OFL9t8/YzP4InNHS+RNIpibcGA/ZNF+EPC6l+yzaMCptk4LDrf+r2O5MaZPWYl9MbX0NreNE+IrdK+FaJC0dT7XGwep3bmF0KHxSiGrDr42FtbMYpuX+MRoI8D+LPGlJ3C+5HRs=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://ir4hys.natappfree.cc/trade/alinotify";//可能执行多次 必须要返回
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://ir4hys.natappfree.cc/trade/alireturnurl";//只执行一次 页面跳转
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtNeyR2kYoudrrZCVv1tpiQtnVSL+Qb+PvZXlDH2sYHGIqsMio9qePP+CABmC56C0y6ii+k7RFan70XbwkWoggaFFLOchmrc174bJZMw5cZyJUqlSoy5Qc5YbWNEH8M0Q5Fjq0e1vU1i2D+0Fwgo3yXKynFHkVEma5SW1jPC0FtUGWd3F8q5g1f8KrJzzzAfe3cTEjzO8czUYh+P3nbHE5hf8cnMlLFIaHYt7QktMaE8md7TygGARVSNwnX6GM+a/q7rurCoCn/cvM/CByp6s7WG7FqeeoQpQpzPFuJDFYIzUNTimBWsR7W1vMnwL+2lqtZ9ETlolHEuHd8rBl2KDNwIDAQAB";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
