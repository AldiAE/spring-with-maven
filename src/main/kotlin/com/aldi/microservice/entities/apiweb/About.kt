package com.aldi.microservice.entities.apiweb

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "abouts")
data class About (

    @Id @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    val id: String?,

    @Column(name = "photo_url")
    var photo_url: String,

    @Column(name = "desc_first", columnDefinition = "TEXT")
    var desc_first: String,

    @Column(name = "desc_second", columnDefinition = "TEXT")
    var desc_second: String,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date?

)