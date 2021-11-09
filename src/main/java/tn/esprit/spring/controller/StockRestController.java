package tn.esprit.spring.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockServiceImpl;

@RestController
@RequestMapping("/stock")
public class StockRestController {
	@Autowired
	StockServiceImpl stockService;
	// http://localhost:8089/SpringMVC/stock/retrieve-all-stocks
	@GetMapping("/retrieve-all-stocks")
	@ResponseBody
	public List<Stock> getStocks() {
		List<Stock> listStocks = stockService.retrieveAllStocks();
		return listStocks;

	}
	// http://localhost:8089/SpringMVC/stock/retrieve-stock/8
		@GetMapping("/retrieve-stock/{stock-id}")
		@ResponseBody
		public Optional<Stock> retrieveStock(@PathVariable("stock-id") Long stockId) {
		return stockService.retrieveStock(stockId);
		}

		// http://localhost:8089/SpringMVC/stock/add-stock
		@PostMapping("/add-stock")
		@ResponseBody
		public Stock addStock(@RequestBody Stock c)
		{
			Stock stock = stockService.addStock(c);
		return stock;
		}
		// http://localhost:8089/SpringMVC/stock/modify-stock
		@PutMapping("/modify-stock")
		@ResponseBody
		public Stock modifyStock(@RequestBody Stock stock) {
		return stockService.updateStock(stock);
		}
	
	
}
