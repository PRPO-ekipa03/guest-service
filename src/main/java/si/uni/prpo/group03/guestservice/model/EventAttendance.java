package si.uni.prpo.group03.guestservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "event_attendance")
public class EventAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    private Guest guest;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(nullable = false)
    private boolean acceptedInvitation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAcceptedInvitation() {
        return acceptedInvitation;
    }

    public void setAcceptedInvitation(boolean acceptedInvitation) {
        this.acceptedInvitation = acceptedInvitation;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
