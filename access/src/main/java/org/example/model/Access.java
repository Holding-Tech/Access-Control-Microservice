package org.example.model;


import jakarta.persistence.*;

@Entity
@Table(name = "access")


public class Access
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "access_id")
    private Long accessId;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "system_id", nullable = false)
    private SystemAccess systemAccess;


    @Column(name = "access_granted", nullable = false)
    private boolean accessGranted;

}
