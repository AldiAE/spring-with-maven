package com.aldi.microservice.entities.apiweb

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "homes")
data class Home (

    @Id @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    val id: String?,

    @Column(name = "name")
    var name: String,

    @Column(name = "short_about", columnDefinition = "TEXT")
    var short_about: String,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date?

)