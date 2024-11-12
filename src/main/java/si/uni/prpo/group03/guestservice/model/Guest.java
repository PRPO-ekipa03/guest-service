package si.uni.prpo.group03.guestservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "Last name cannot be empty")
    private String lastName;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;

    @OneToMany(mappedBy = "guest")
    private Set<EventAttendance> eventAttendances;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "First name cannot be empty") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "First name cannot be empty") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Last name cannot be empty") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Last name cannot be empty") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Email cannot be empty") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email cannot be empty") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public Set<EventAttendance> getEventAttendances() {
        return eventAttendances;
    }

    public void setEventAttendances(Set<EventAttendance> eventAttendances) {
        this.eventAttendances = eventAttendances;
    }
}
