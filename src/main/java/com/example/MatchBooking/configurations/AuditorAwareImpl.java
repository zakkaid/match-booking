package com.example.MatchBooking.configurations;
import org.springframework.data.domain.AuditorAware;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Get the currently logged-in user's username from Spring Security context
        return null;
        //return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}

