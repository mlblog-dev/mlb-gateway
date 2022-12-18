package org.github.mlb.gateway.properties;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author JiHongYuan
 * @date 2022/3/7 15:10
 */
@Configurable
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String secret;

    private String issuer;

    private Integer expirationSecond;

}
