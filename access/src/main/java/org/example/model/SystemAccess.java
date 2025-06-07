package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "system",uniqueConstraints = @UniqueConstraint(columnNames = "system_name"))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemAccess
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "system_id")
    private Long systemId;

    @Column(name = "system_name", nullable = false,unique = true,length = 100)
    private String systemName;
}
