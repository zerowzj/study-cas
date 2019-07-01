package study.cas.client.filter;


import org.jasig.cas.client.Protocol;
import org.jasig.cas.client.util.AbstractCasFilter;

import java.io.IOException;

public class CustomAuthenticationFilter extends AbstractCasFilter {

    protected CustomAuthenticationFilter(Protocol protocol) {
        super(protocol);
    }

//    public final void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
//                               FilterChain filterChain) throws IOException, ServletException {
//
//    }
}
