cat quotes.csv| awk '{if ($1 != "quote_id") printf "%s\t%s\t%s\t%s\n", $1, $2, $3, $4}'| sort -t $'\t' -k 3,3 -k 4,4  > s_quotes.csv
awk 'BEGIN{printf  "quote_id\tinvite_id\tsent_time\n"}1' s_quotes.csv > sort_quotes.csv
cat invites.csv| awk '{if ($1 != "invite_id") printf "%s\t%s\t%s\t%s\t%s\n", $1, $2, $3, $4, $5}'| sort -t $'\t' -k 4,4 -k 5,5  > s_invites.csv
awk 'BEGIN{printf  "quote_id\tinvite_id\tuser_id\tsent_time\n"}1' s_invites.csv > sort_invites.csv
