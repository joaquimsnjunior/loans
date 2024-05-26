package backend.desafio.loans.controller.dto;

import backend.desafio.loans.domain.LoanType;

public record LoanResponse(LoanType Type, Double interestRate) {
}
