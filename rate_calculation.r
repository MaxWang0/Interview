quote <- read.table("output_quotes.csv", header = T, sep = "\t")
invite <- read.table("output_invites.csv", header = T, sep = "\t")
rate <- round(quote[,2]/invite[,2], 2)  # quote_count/invite_count
output_rate <- cbind(as.character(quote[,1]), rate, quote[,2], invite[,2]) #merge two table together
title <-c("sent_time", "rate", "quote", "invite")
output_rate <- rbind(title, output_rate)
write.table(output_rate, "output_rate.csv", row.names = F, col.names = F, sep = "\t", quote = F)
rate <- read.table("output_rate.csv", header = T, sep = "\t")
plot(rate[,1], rate[,2], main = "rate_timeseries", xlab = "time_sent", ylab = "rate" , ylim = c(0,1.5))

library(zoo)
zoo_rate <- read.zoo("output_rate.csv", header = T, sep = "\t")
plot(zoo_rate, xlab = "time_sent", main = "Time_series")

rate <- read.table("merge_output_invite_quote.csv", header = T, sep = "\t")
output1 <- lm(qt$rate ~ qt$request_id)
summary(output1)



