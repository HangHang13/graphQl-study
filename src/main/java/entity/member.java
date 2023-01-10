package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class member {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_sn", nullable = false, precision = 15, scale = 0)
    private Long memberSn;

    @Column(name = "member_id", nullable = false, length = 100)
    private String memberId;

}
