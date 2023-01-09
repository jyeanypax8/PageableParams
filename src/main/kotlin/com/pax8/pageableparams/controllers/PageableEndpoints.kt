package com.pax8.pageableparams.controllers

import com.pax8.pageableparams.dto.StrMessage
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/page-params")
@RestController
class PageableEndpoints {

    @GetMapping
    fun testPageable(pageable: Pageable): StrMessage {
        return StrMessage("Page: ${pageable.pageNumber} Limit: ${pageable.pageSize}")
    }

}