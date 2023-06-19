package metrics.config;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.config.NamingConvention;
import io.micrometer.core.instrument.util.HierarchicalNameMapper;
import io.micrometer.graphite.GraphiteConfig;
import io.micrometer.graphite.GraphiteHierarchicalNamingConvention;
import io.micrometer.graphite.GraphiteMeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "management.graphite.metrics.export", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MetricConfig {

    @Value("${management.graphite.metrics.export.global-prefix}")
    private String globalPrefix;

    @Bean
    public GraphiteMeterRegistry graphiteMeterRegistry(
            final GraphiteConfig graphiteConfig,
            final Clock clock,
            final NamingConvention namingConvention) {
        return new GraphiteMeterRegistry(
                graphiteConfig,
                clock,
                (id, convention) -> this.globalPrefix + "." + HierarchicalNameMapper.DEFAULT.toHierarchicalName(id, namingConvention));
    }

    @Bean
    public NamingConvention graphiteHierarchicalNamingConvention() {
        return new GraphiteHierarchicalNamingConvention();
    }
}
