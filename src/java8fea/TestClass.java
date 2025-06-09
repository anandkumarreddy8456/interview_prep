package java8fea;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		List<Transaction> transactions = List.of(
				   new Transaction(1, 250.0, LocalDate.now().minusDays(5)),
				   new Transaction(2, 500.0, LocalDate.now().minusDays(10)),
				   new Transaction(1, 300.0, LocalDate.now().minusDays(20)),
				   new Transaction(3, 800.0, LocalDate.now().minusDays(2)),
				   new Transaction(4, 200.0, LocalDate.now().minusDays(35)),   
				   new Transaction(2, 200.0, LocalDate.now().minusDays(3)),
				   new Transaction(5, 1000.0, LocalDate.now().minusDays(1)),
				   new Transaction(1, 100.0, LocalDate.now().minusDays(1))
				);
		
		LocalDate today=LocalDate.now();
		LocalDate minus30=today.minusDays(30);
		
		List<Transaction> result=transactions.stream().filter(q->!q.getDate().isBefore(minus30))
				.collect(Collectors.groupingBy(Transaction::getId,Collectors.summingDouble(Transaction::getAmount)))
				.entrySet().stream().map(t->new Transaction(t.getKey(),t.getValue(), today))
				.sorted(Comparator.comparing(Transaction::getAmount).reversed()).limit(3).toList();
		
		
		
		System.out.println(result);
		
	}
	

}
class Transaction {
	private Integer id;
	private Double amount;
	private LocalDate date;
	
	public Transaction(Integer id, Double amount, LocalDate date) {
		super();
		this.id = id;
		this.amount = amount;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", date=" + date + "]";
	}
	
}