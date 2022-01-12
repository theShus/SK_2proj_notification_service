package app.domain;

import javax.persistence.*;

@Entity
public class ReminderNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Notification notification;

}