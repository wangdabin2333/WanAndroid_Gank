package com.samiu.host.model.repository

import com.samiu.host.global.NETWORK_ERROR
import com.samiu.host.model.http.BaseWanRepository
import com.samiu.host.model.http.WanClient

/**
 * @author Samiu 2020/3/5
 */
class WanSquareRepository : BaseWanRepository() {

    suspend fun getSquareArticle(page: Int) = readyCall(
        call = {
            call(WanClient.service.getSquareArticleList(page))
        }, errorMessage = NETWORK_ERROR
    )
}