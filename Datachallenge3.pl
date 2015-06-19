#!/usr/bin/perl


use strict;
use warnings;

open(IN, "output_invite_quote.csv")or die("file open error");

open(OUT, ">merge_output_invite_quote.csv");

my @array;
my $invite = 0;
my $quote = 0;
my $n = 0;
my $request_index = 1;
my $category_id = 46;
my $category = 'DJ';
my $location = "Austin-Round";
my $location_id = 35;
my $sent_time = "2013-07-01";
my $rate = 0;
while(<IN>){
  chomp;

  @array = split;
  if($n != 0){
    if($array[1] == $request_index){
      $invite++;
      $quote += $array[5];
    }else{
      $rate = $quote/$invite;
      print OUT "$request_index\t$array[3]\t$quote\t$invite\t$rate\t$category_id\t$category\t$location_id\t$location\n";
      $request_index = $array[1];
      $invite = 1;
      $quote = 0;
      $quote += $array[5];
      $category_id = $array[6];
      $category = $array[7];
      $location_id = $array[8];
      $location = $array[9];
     }
   }else{
      print OUT "request_id\tsent_time\tquote\tinvite\trate\tcategory_id\tcategory\tlocation_id\tlocation\n"
   }

   $n++;
}

$rate = $quote/$invite;

print OUT "$request_index\t$array[3]\t$quote\t$invite\t$rate\t$category_id\t$category\t$location_id\t$location\n";

close IN;
close OUT;

