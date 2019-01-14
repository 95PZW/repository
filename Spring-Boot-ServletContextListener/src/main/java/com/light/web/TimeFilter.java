package com.light.web;


import javax.servlet.*;
import java.io.IOException;

public class TimeFilter implements Filter {/*自定义过滤器*/

    /*要使该过滤器生效，有两种方式：
    * 1、使用@Component注解
    * 2、添加到过滤器中，此方法适用于第三方的过滤器。
    * */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));
    }
    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }
}
