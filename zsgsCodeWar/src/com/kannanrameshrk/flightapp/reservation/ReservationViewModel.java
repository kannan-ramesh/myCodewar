package com.kannanrameshrk.flightapp.reservation;

import java.util.ArrayList;
import java.util.List;

import com.kannanrameshrk.flightapp.dto.Passanger;
import com.kannanrameshrk.flightapp.dto.Pnr;
import com.kannanrameshrk.flightapp.repository.Repository;

public class ReservationViewModel {
	private ReservationView reservationView;
	
	public ReservationViewModel(ReservationView reservationView) {
		this.reservationView=reservationView;
	}

	public List<Pnr> getData(int pnrNum) {
		
		List<Pnr> list=Repository.getInstance().getData();
		List<Pnr> data=new ArrayList<>();
		for(Pnr lists:list) {
			if(lists.getPnrNum()==pnrNum) {
				data.add(lists);
			}
		}
		if(list.isEmpty()) {
			reservationView.onErr("No data found");
		}
		return list;
	}

	public List<Pnr> getTickets() {
		List<Pnr> list=Repository.getInstance().getData();
		if(list.isEmpty()) {
			reservationView.onErr("user not found in ticket Booking");
		}
		return list;
	}

	public double cancelTickets(int pnrNum) {
		List<Pnr> list=Repository.getInstance().getData();
		double fareAmount = 0.0;
		for(Pnr lists:list) {
			if(lists.getPnrNum()==pnrNum) {
				fareAmount=lists.getRotalFare();
				list.remove(lists);
				break;
			}
		}
		return fareAmount;
	}

	public List<Pnr> getPassangerData(int id) {
		List<Pnr> list=Repository.getInstance().getData();
		List<Pnr> data=new ArrayList<>();
		for(Pnr lists:list) {
			for(Passanger passanger:lists.getPassanger()) {
				if(passanger.getId()==id) {
					data.add(lists);
					break;
				}
			}
		}
		if(list.isEmpty()) {
			reservationView.onErr("No data found");
		}
		return list;
	}
}
