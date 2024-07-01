package com.izpan.infrastructure.intercepter;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class TokenAuthInterceptor implements HandlerInterceptor {
    private static final String BEARER_PATTERN = "^Bearer\\s+sk-(.*)$"; // 修改正则表达式

    public static String extractBearerToken(String authorizationHeader) {
        if (authorizationHeader != null && !authorizationHeader.isEmpty()) {
            Pattern pattern = Pattern.compile(BEARER_PATTERN);
            Matcher matcher = pattern.matcher(authorizationHeader);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null; // 或抛出异常，取决于你的需求
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        buildCors(request, response);
        String authorizationHeader = request.getHeader("Authorization");
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ") && !authorizationHeader.startsWith("sk-")) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("{\"success\": false, \"message\": \"Missing or invalid authorization header\"}");
            return false;
        }

//
//        ReqInfoContext.setReqInfo(new ReqInfoContext.ReqInfo() {{
//            setBearer();
//        }});
//
//        String tokenKey = authorizationHeader.replace("Bearer ", "").replace("sk-", "");
//        String[] parts = tokenKey.split("-", 2);
//        tokenKey = parts[0];
//        UserToken token = userTokenService.validateUserToken(tokenKey);
//        if (token == null) {
//            response.setStatus(HttpStatus.UNAUTHORIZED.value());
//            response.getWriter().write("{\"success\": false, \"message\": \"Invalid token\"}");
//            return false;
//        }
//
//        if (token.getSubnet() != null && !token.getSubnet().isEmpty() && !NetworkUtil.isIpInSubnets(request.getRemoteAddr(), token.getSubnet())) {
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            response.getWriter().write("{\"success\": false, \"message\": \"This token is only allowed to be used within the specified subnet: " + token.getSubnet() + ", current IP: " + request.getRemoteAddr() + "\"}");
//            return false;
//        }
//
//        if (!userService.isUserEnabled(token.getUserId()) || blacklistService.isUserBanned(token.getUserId())) {
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            response.getWriter().write("{\"success\": false, \"message\": \"User is banned\"}");
//            return false;
//        }
//
//        String requestModel = getRequestModel(request);
//        if (requestModel != null && shouldCheckModel(request) && token.getModels() != null && !token.getModels().isEmpty() && !isModelInList(requestModel, token.getModels())) {
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            response.getWriter().write("{\"success\": false, \"message\": \"This token is not allowed to use the model: " + requestModel + "\"}");
//            return false;
//        }
//
//        request.setAttribute("userId", token.getUserId());
//        request.setAttribute("tokenId", token.getId());
//        request.setAttribute("tokenName", token.getName());
//        if (parts.length > 1) {
//            if (userService.isAdmin(token.getUserId())) {
//                request.setAttribute("specificChannelId", parts[1]);
//            } else {
//                response.setStatus(HttpStatus.FORBIDDEN.value());
//                response.getWriter().write("{\"success\": false, \"message\": \"Regular users are not allowed to specify channels\"}");
//                return false;
//            }
//        }


        return true;
    }

    /**
     * 支持跨域
     *
     * @param request
     * @param response
     */
    public static void buildCors(HttpServletRequest request, HttpServletResponse response) {
        String origin = request.getHeader("Origin");
        if (StringUtils.isBlank(origin)) {
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Credentials", "false");
        } else {
            response.setHeader("Access-Control-Allow-Origin", origin);
            response.setHeader("Access-Control-Allow-Credentials", "true");
        }
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-Real-IP, X-Forwarded-For, d-uuid, User-Agent, x-zd-cs, Proxy-Client-IP, HTTP_CLIENT_IP, HTTP_X_FORWARDED_FOR");
    }
}