package okhttpTest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpExample {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://www.yaohuo.me")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                // 打印响应体的字符串
                // 请注意，对于大的响应体，直接调用string()方法可能不是最佳做法，因为它会将整个文档加载到内存中。
                // 对于大文档，考虑流式处理或分块读取响应体。
                String responseBody = response.body().string();
                System.out.println(responseBody);
            } else {
                // 响应失败
                System.err.println("Request to www.yaohuo.me failed: " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
