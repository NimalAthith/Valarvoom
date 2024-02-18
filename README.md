# Valarvoom
Multipurpose management app

## Requirement
1) Buggeting
2) Usage Tracking eg. Cylinder usage tracking
3) Usage/rate predicating eg. EB Billing


```mermaid
flowchart LR;
IncomeDB --> ExpenseType --> ForecastDB --> LiveTrackingDB   

subgraph IncomeDB["Database to Handle User Income"]
IncomeColumn["| Name | Income Type | Income Amount |"]
end

subgraph ForecastDB["Expense Forecast DB"]
direction TB;
BeforeLiveTracking["Step 1 Before Live Tracking"] --> step2["Action on Every month last date"]
step2 --> Step3["Table Column\n\n|Expense Type| Date | Description | Amount |"]
end


subgraph ExpenseType["Expense DB"]
direction TB;
Column["|Expense Type|"]
end

subgraph LiveTrackingDB["Live Tracking DB"]
direction TB;
column["| Expense Type | Date | Description | Current Amount |"]

end


## ER Diagram
![Blank diagram(1)](https://github.com/NimalAthith/Valarvoom/assets/98890534/40f1e465-bf87-4620-8cfd-9d72321e1737)

