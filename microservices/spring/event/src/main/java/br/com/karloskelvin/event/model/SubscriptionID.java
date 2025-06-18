package br.com.karloskelvin.event.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class SubscriptionID {

    @ManyToOne
    @JoinColumn(name = "subscribed_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionID that = (SubscriptionID) o;
        return Objects.equals(user, that.user) && Objects.equals(session, that.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, session);
    }
}
