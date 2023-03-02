package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    /**
     * return list of all auctions
     *
     * @return
     */
   @RequestMapping( method = RequestMethod.GET)
   public List<Auction> list() {
        return dao.list();
    }

    /**
     * return specific auction based on the value passed to it
     *
     * @param id auction id
     * @return all info for given auction
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
    return dao.get(id);
    }

    /**
     * add the auction that is passed to it
     *
     * @param auction
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction){
        return dao.create(auction);
    }

    /**
     * searching by title
     *
     * @param title
     * @return
     */
    @RequestMapping( path = "/auctions?title_like={searchTerm}", method = RequestMethod.GET)
    public List<Auction> searchByTitle(@RequestParam(required = false) @PathVariable("") String title_like) {
        return dao.searchByTitle(title_like);
    }




}
