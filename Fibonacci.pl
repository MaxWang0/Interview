#!/usr/bin/perl

use strict;
use warnings;

sub fib{
  my $n = shift;
  
  if($n == 1 or $n == 2){
    return 1;
  }else{
    return fib($n-1) + fib($n-2);
  }
}

print "fib($nums)\n";
  
